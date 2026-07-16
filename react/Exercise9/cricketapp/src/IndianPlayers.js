import React from 'react';

function IndianPlayers() {
  const team = [
    'Rohit Sharma', 'Virat Kohli', 'Shubman Gill', 'Shreyas Iyer',
    'KL Rahul', 'Hardik Pandya', 'Ravindra Jadeja', 'Jasprit Bumrah',
    'Mohammed Shami', 'Kuldeep Yadav', 'Ishan Kishan',
  ];

  // ES6 Destructuring - picking specific positions
  const [player1, player2, player3, , , player6, ...rest] = team;
  const oddTeamPlayers = [player1, player3, ...rest.filter((_, i) => i % 2 === 0)];
  const evenTeamPlayers = [player2, player6, ...rest.filter((_, i) => i % 2 !== 0)];

  // ES6 Merge feature (spread operator)
  const T20players = ['Rohit Sharma', 'Virat Kohli', 'Suryakumar Yadav'];
  const RanjiTrophyPlayers = ['Sarfaraz Khan', 'Yashasvi Jaiswal', 'Tilak Varma'];
  const mergedPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Odd Team Players</h2>
      <p>{oddTeamPlayers.join(', ')}</p>

      <h2>Even Team Players</h2>
      <p>{evenTeamPlayers.join(', ')}</p>

      <h2>Merged Squad (T20 + Ranji Trophy)</h2>
      <p>{mergedPlayers.join(', ')}</p>
    </div>
  );
}

export default IndianPlayers;