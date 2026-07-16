import React, { Component } from 'react';
import Cart from './Cart';

class OnlineShopping extends Component {
  constructor(props) {
    super(props);
    this.cartItems = [
      new Cart('Laptop', 55000),
      new Cart('Headphones', 1500),
      new Cart('Keyboard', 800),
      new Cart('Mouse', 500),
      new Cart('Monitor', 9000),
    ];
  }

  render() {
    return (
      <div>
        <h2>Online Shopping Cart</h2>
        <table border="1" cellPadding="8">
          <thead>
            <tr>
              <th>Item Name</th>
              <th>Price</th>
            </tr>
          </thead>
          <tbody>
            {this.cartItems.map((item, index) => (
              <tr key={index}>
                <td>{item.Itemname}</td>
                <td>{item.Price}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    );
  }
}

export default OnlineShopping;