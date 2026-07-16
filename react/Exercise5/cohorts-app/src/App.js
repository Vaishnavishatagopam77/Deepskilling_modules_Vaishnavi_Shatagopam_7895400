import React from 'react';
import CohortDetails from './CohortDetails';
import cohortsMock from './CohortsMock';

function App() {
  return (
    <div>
      <h1>Cohorts Details</h1>
      {cohortsMock.map((cohort) => (
        <CohortDetails key={cohort.id} cohort={cohort} />
      ))}
    </div>
  );
}

export default App;
