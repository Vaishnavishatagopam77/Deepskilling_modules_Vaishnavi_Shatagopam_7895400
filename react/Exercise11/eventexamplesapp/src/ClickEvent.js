import React, { Component } from 'react';

class ClickEvent extends Component {
  constructor(props) {
    super(props);
    this.state = { message: '' };
    this.handlePress = this.handlePress.bind(this);
  }

  // React's SyntheticEvent object is passed automatically
  handlePress(event) {
    this.setState({ message: 'I was clicked' });
    console.log('Synthetic event type:', event.type);
  }

  render() {
    return (
      <div>
        <button onClick={this.handlePress}>Press Me</button>
        <p>{this.state.message}</p>
      </div>
    );
  }
}

export default ClickEvent;