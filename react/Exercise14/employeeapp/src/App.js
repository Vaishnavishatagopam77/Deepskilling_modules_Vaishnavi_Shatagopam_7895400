import React, { Component } from 'react';
import EmployeesList from './EmployeesList';
import ThemeContext from './ThemeContext';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = { theme: 'light' };
    this.toggleTheme = this.toggleTheme.bind(this);
  }

  toggleTheme() {
    this.setState((prev) => ({ theme: prev.theme === 'light' ? 'dark' : 'light' }));
  }

  render() {
    return (
      <ThemeContext.Provider value={this.state.theme}>
        <div>
          <h1>Employee Management</h1>
          <button onClick={this.toggleTheme}>Toggle Theme</button>
          {/* theme is no longer passed as a prop */}
          <EmployeesList />
        </div>
      </ThemeContext.Provider>
    );
  }
}

export default App;