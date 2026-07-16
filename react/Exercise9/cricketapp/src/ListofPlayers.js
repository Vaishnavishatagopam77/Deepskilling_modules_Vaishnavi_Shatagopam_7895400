import React from 'react';

function ListofPlayers() {
  const players = [
    { name: 'Rohit Sharma', score: 85 },
    { name: 'Virat Kohli', score: 92 },
    { name: 'Shubman Gill', score: 45 },
    { name: 'Shreyas Iyer', score: 60 },
    { name: 'KL Rahul', score: 78 },
    { name: 'Hardik Pandya', score: 55 },
    { name: 'Ravindra Jadeja', score: 40 },
    { name: 'Jasprit Bumrah', score: 12 },
    { name: 'Mohammed Shami', score: 8 },
    { name: 'Kuldeep Yadav', score: 15 },
    { name: 'Ishan Kishan', score: 66 },
  ];

  // Arrow function used with filter() — ES6
  const lowScorers = players.filter((player) => player.score < 70);

  return (
    <div>
      <h2>List of Players</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>

      <h2>Players with score below 70</h2>
      <ul>
        {lowScorers.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
}

export default ListofPlayers;