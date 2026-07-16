import React, { Component } from 'react';

class Counter extends Component {
  constructor(props) {
    super(props);
    this.state = { count: 0 };
    this.handleIncrement = this.handleIncrement.bind(this);
    this.handleDecrement = this.handleDecrement.bind(this);
    this.sayHello = this.sayHello.bind(this);
  }

  handleIncrement() {
    this.setState((prevState) => ({ count: prevState.count + 1 }));
    this.sayHello();
  }

  handleDecrement() {
    this.setState((prevState) => ({ count: prevState.count - 1 }));
  }

  sayHello() {
    console.log('Hello, the counter was incremented!');
  }

  render() {
    return (
      <div>
        <h2>Counter: {this.state.count}</h2>
        <button onClick={this.handleIncrement}>Increment</button>
        <button onClick={this.handleDecrement}>Decrement</button>
      </div>
    );
  }
}

export default Counter;