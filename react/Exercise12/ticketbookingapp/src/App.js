import React, { Component } from 'react';
import GuestPage from './GuestPage';
import UserPage from './UserPage';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = { isLoggedIn: false };
    this.handleLogin = this.handleLogin.bind(this);
    this.handleLogout = this.handleLogout.bind(this);
  }

  handleLogin() {
    this.setState({ isLoggedIn: true });
  }

  handleLogout() {
    this.setState({ isLoggedIn: false });
  }

  render() {
    // Element variable to prevent/allow rendering
    let page;
    if (this.state.isLoggedIn) {
      page = <UserPage />;
    } else {
      page = <GuestPage />;
    }

    return (
      <div>
        <h1>Ticket Booking App</h1>
        {this.state.isLoggedIn ? (
          <button onClick={this.handleLogout}>Logout</button>
        ) : (
          <button onClick={this.handleLogin}>Login</button>
        )}
        {page}
      </div>
    );
  }
}

export default App;