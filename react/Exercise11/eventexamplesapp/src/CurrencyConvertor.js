import React, { Component } from 'react';

class CurrencyConvertor extends Component {
  constructor(props) {
    super(props);
    this.state = { rupees: '', euro: null };
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleChange(event) {
    this.setState({ rupees: event.target.value });
  }

  handleSubmit(event) {
    event.preventDefault();
    const conversionRate = 0.011; // 1 INR ≈ 0.011 EUR
    const euroValue = (this.state.rupees * conversionRate).toFixed(2);
    this.setState({ euro: euroValue });
  }

  render() {
    return (
      <div>
        <h2>Currency Convertor (INR to EUR)</h2>
        <input
          type="number"
          placeholder="Enter amount in Rupees"
          value={this.state.rupees}
          onChange={this.handleChange}
        />
        <button onClick={this.handleSubmit}>Convert</button>
        {this.state.euro !== null && (
          <p>Euro: € {this.state.euro}</p>
        )}
      </div>
    );
  }
}

export default CurrencyConvertor;