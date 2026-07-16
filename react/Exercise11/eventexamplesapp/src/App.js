import React from 'react';
import Counter from './Counter';
import Welcome from './Welcome';
import ClickEvent from './ClickEvent';
import CurrencyConvertor from './CurrencyConvertor';

function App() {
  return (
    <div>
      <h1>Event Examples App</h1>
      <Counter />
      <Welcome />
      <ClickEvent />
      <CurrencyConvertor />
    </div>
  );
}

export default App;