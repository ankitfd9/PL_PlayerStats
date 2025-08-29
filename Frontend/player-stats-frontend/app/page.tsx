'use client';
export type Player = {
    id: number;
    name: string;
    nation: string;
    position: string;
    age: number;
    matchPlayed: number;
    starts: number;
    minutesPlayed: number;
    goals: number;
    assists: number;
    penaltyGoals: number;
    yellowCards: number;
    redCards: number;
    xG: number;
    xA: number;
    club: string;
}

import {useState} from 'react';

import Navigation from './components/navigation';
import Box from './components/box';
import Footer from './components/footer';

export default function Home() {
  const [query,setQuery]= useState("");
  const [results,setResults]= useState<Player[]>([]);
  return (
    <>
      <div className='min-h-screen flex flex-col bg-gray-100 p-10'>
      <Navigation setQuery={setQuery} setResults={setResults} query={query}/>
      <Main>
        <Box results={results}/>
      </Main>

      </div>
      <Footer/>
    </>
  );
}

function Main({children}:{children:React.ReactNode}){
  return(
    <main className="p-4 flex justify-center items-start text-gray-700 bg-orange-100 ">
      {children}
    </main>
  )
}
