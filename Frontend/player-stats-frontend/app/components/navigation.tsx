'use client';
import { useState,useEffect } from "react";
import { Player } from "../page";

export default function Navigation({setQuery,setResults,query}:{setQuery:React.Dispatch<React.SetStateAction<string>>,setResults:React.Dispatch<React.SetStateAction<Player[]>>,query:string}) {
    const [isOpen,setIsOpen]= useState(false);
    const [isSticky,setIsSticky]= useState(false);

    useEffect(()=>{
        // Handle search query change
        console.log("Search query:", query);
        async function fetchData(){
            const res = await fetch(`http://localhost:8080/players/name?name=${query}`);
            const data = await res.json();
            setResults(data || []);
            console.log(data);
        }
        fetchData();
    },[query,setResults]);

    useEffect(()=>{
        function handleScroll(){
            console.log("ScrollY:", window.scrollY);
            if(window.scrollY>75){
                setIsSticky(true);
            }else {
                setIsSticky(false);
            }
        }
        window.addEventListener('scroll',handleScroll);
        return ()=>window.removeEventListener('scroll',handleScroll);
    },[]);


  return (
    <div className="bg-white text-black font-semibold uppercase tracking-tight text-sm font-family-helvetica justify-center">
        <Logo/>
        {isSticky?
            <div className={`w-full ${isSticky ? 'fixed top-0 left-0 shadow-lg transition-transform duration-[250ms] ease-in-out translate-y-0' : 'relative translate-y-full' } z-50`}>
                <MenuItems isOpen={isOpen} isSticky={isSticky} query={query} setQuery={setQuery} setIsOpen={setIsOpen}/>
            </div> :
            <MenuItems isOpen={isOpen} isSticky={isSticky} query={query} setQuery={setQuery} setIsOpen={setIsOpen}/>
        }
    </div>
  );
}

function Logo(){
    return(
        <div className="p-2 bg-gray-100 text-white flex justify-end items-center">
            <img src="/football.png" alt="logo" className="absolute left-1/2 transform -translate-x-1/2"/>
            <div className="text-sm text-black font-normal uppercase bg-[#d4af37] px-4 py-2 jusify-end rounded ">
                <a href="#" className="mr-2">Login</a> | <a href="#">Register</a>
            </div>
        </div>
    )
}

function MenuItems({isOpen,isSticky,query,setQuery,setIsOpen}:{isOpen:boolean, isSticky:boolean,query:string ,setQuery:React.Dispatch<React.SetStateAction<string>>,setIsOpen:React.Dispatch<React.SetStateAction<boolean>>}){
    return(
        <>
            <div className="p-4 bg-gray-100 bg-white text-black font-semibold uppercase tracking-tight text-sm flex border-b border-black border-t justify-between items-center">
                <div className="flex gap-4 justify-start items-center"> 
                    <button onClick={()=>setIsOpen(!isOpen)} className="text-2xl">
                        ☰
                    </button>
                    <button onClick={()=>setIsOpen(!isOpen)} className="text-2xl">
                        {isOpen ? 'X':
                        <svg xmlns="http://www.w3.org/2000/svg" className="h-5 w-5 text-gray-600" fill="none" viewBox="0 0 24 24" stroke="currentColor">
                            <path strokeLinecap="round" strokeLinejoin="round" strokeWidth={2} d="M21 21l-4.35-4.35M17 10a7 7 0 11-14 0 7 7 0 0114 0z" />
                        </svg>
                        }
                    </button>
                </div>
                <div className="flex gap-10 justify-between items-center bg-white text-black font-semibold font-family-helvetica uppercase font-weight:600 tracking-tight text-sm text-sm">
                    <a href="#" className="hover:text-gray-600">Home</a>
                    <a href="#" className="hover:text-gray-600">About</a>
                    <a href="#" className="hover:text-gray-600">Contact</a>
                    <a href="#" className="hover:text-gray-600">Services</a>
                    <a href="#" className="hover:text-gray-600">Blog</a>
                </div>
                <div className="flex gap-6 justify-end items-center">
                    <a href="#" className="hover:text-gray-600">Forum</a>
                </div>            
            </div>
            <div className=" flex items-center bg-gray-100">
                {isOpen ?
                    <div className="relative w-full ">
                        <input autoFocus className="w-full padding-0.5rem border border-gray-300 rounded h-10 focus:outline-none focus:ring-2 focus:ring-gray-500 "
                        type="text" 
                        placeholder="Search Players by Name, Club or Nationality"
                        value={query} 
                        onChange={(e)=>setQuery(e.target.value)}/>
                        <button tabIndex={-1} className="absolute right-1 top-1/2 -translate-y-1/2 bg-[#d4af37] text-black px-3 py-1 uppercase rounded text-sm">
                            Search
                        </button>
                    </div>
                    : isSticky?<></>:<div className={`h-10 w-full}`}></div>            
                }
            </div>
        </>
    )
}