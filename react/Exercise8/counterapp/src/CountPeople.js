import React, { Component } from 'react';

class CountPeople extends Component {
  constructor(props) {
    super(props);
    this.state = {
      entrycount: 0,
      exitcount: 0,
    };
    this.UpdateEntry = this.UpdateEntry.bind(this);
    this.UpdateExit = this.UpdateExit.bind(this);
  }
  UpdateEntry() {
    this.setState({ entrycount: this.state.entrycount + 1 });
  }

  UpdateExit() {
    this.setState({ exitcount: this.state.exitcount + 1 });
  }

  render() {
    return (
      <div>
        <h2>Mall Entry / Exit Counter</h2>
        <button onClick={this.UpdateEntry}>Login</button>
        <button onClick={this.UpdateExit}>Exit</button>
        <p>Number of people entered: {this.state.entrycount}</p>
        <p>Number of people exited: {this.state.exitcount}</p>
      </div>
    );
  }
}

export default CountPeople;