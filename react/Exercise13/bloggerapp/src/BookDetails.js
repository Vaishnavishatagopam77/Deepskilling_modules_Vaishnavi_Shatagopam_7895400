import React, { Component } from 'react';

class BookDetails extends Component {
  constructor(props) {
    super(props);
    this.state = {
      showBooks: true,
      books: [
        { id: 1, title: 'The Alchemist', author: 'Paulo Coelho' },
        { id: 2, title: 'Atomic Habits', author: 'James Clear' },
        { id: 3, title: 'Clean Code', author: 'Robert C. Martin' },
      ],
    };
    this.toggleBooks = this.toggleBooks.bind(this);
  }

  toggleBooks() {
    this.setState((prev) => ({ showBooks: !prev.showBooks }));
  }

  render() {
    // Conditional rendering using if/else
    if (!this.state.showBooks) {
      return (
        <div>
          <button onClick={this.toggleBooks}>Show Books</button>
        </div>
      );
    }

    return (
      <div>
        <h2>Book Details</h2>
        <button onClick={this.toggleBooks}>Hide Books</button>
        <ul>
          {this.state.books.map((book) => (
            // key prop required when rendering lists
            <li key={book.id}>{book.title} — {book.author}</li>
          ))}
        </ul>
      </div>
    );
  }
}

export default BookDetails;