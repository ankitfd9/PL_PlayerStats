'use client'
import {useState} from "react";
import type { Player } from '../page';

export default function Box({results}:{results:Player[]}) {
    const [selectedPlayer,setSelectedPlayer]= useState<Player | null>(null);

    function handleSelectPlayer(player:Player) {
        setSelectedPlayer(player);
        console.log("Selected Player:", player);
    }

    return (
        <div className="p-4 rounded shadow border border-radius-0.9 flex flex-row gap-4 w-full box-border min-h-[600px] max-h-[600px] font-color-black font-family-helvetica"> 
            <div className="flex-1 overflow-y-auto scrollbar-hidden">
                <PlayerCard key={1} players={results} onSelectPlayer={handleSelectPlayer}/>                
            </div>
            <div className="flex-1 selected-player-info margin-top-1rem padding-1rem border border-gray-300 bg-silver shadow ">
            {selectedPlayer && <>
                <h2 className="text-xl font-bold margin-bottom-0.5rem ">Selected Player Details</h2>
                <p>Player Name: {selectedPlayer.name}</p>
                <p>Player ID: {selectedPlayer.id}</p>
                <p>Player Goals: {selectedPlayer.goals}</p>
                <p>Player Assists: {selectedPlayer.assists}</p>
                <p>Player Club: {selectedPlayer.club}</p>
                <p>Player Nation: {selectedPlayer.nation}</p>
                <p>Player Position: {selectedPlayer.position}</p>
                <p>Player Age: {selectedPlayer.age}</p>
                <p>Matches Played: {selectedPlayer.matchPlayed}</p>
                <p>Yellow Cards: {selectedPlayer.yellowCards}</p>
                <p>Red Cards: {selectedPlayer.redCards}</p>
                <p>Minutes Played: {selectedPlayer.minutesPlayed}</p>
                <p>Expected Goals (xG): {selectedPlayer.xG}</p>
            </>
            }
            </div>
        </div>
    )
}

function PlayerCard({players,onSelectPlayer}:{players:Player[],onSelectPlayer:(player:Player)=>void}){

    return (
        <ul className="list-style-none padding-0.8rem margin-0">
            {players.map((player,index)=>(
                <PlayerItem  player={player} onSelectPlayer={onSelectPlayer} key={index}/>
            ))}
        </ul>
    )
}

function PlayerItem({player,onSelectPlayer}:{player:Player,onSelectPlayer:(player:Player)=>void}){
    return (
        <li onClick={()=>onSelectPlayer(player)} className="cursor-pointer padding-0.5rem border-b border-gray-300 hover:bg-pink-200">
            <span className="font-bold">{player.name}</span> - {player.club} - {player.nation.slice(-3)}
        </li>
    )
}