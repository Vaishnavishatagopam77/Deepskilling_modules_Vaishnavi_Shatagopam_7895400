import { CalculateScore } from './Components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore
        Name="Vaishnavi"
        School="MRECW"
        total={480}
        goal={6}
      />
    </div>
  );
}

export default App;