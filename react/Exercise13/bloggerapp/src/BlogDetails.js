import React, { Component } from 'react';

class BlogDetails extends Component {
  constructor(props) {
    super(props);
    this.state = {
      isLoggedIn: false,
      blogs: [
        { id: 1, title: 'Getting Started with React' },
        { id: 2, title: 'Understanding Context API' },
        { id: 3, title: 'React Hooks Explained' },
      ],
    };
    this.toggleLogin = this.toggleLogin.bind(this);
  }

  toggleLogin() {
    this.setState((prev) => ({ isLoggedIn: !prev.isLoggedIn }));
  }

  render() {
    // Conditional rendering using an element variable
    let button;
    if (this.state.isLoggedIn) {
      button = <button onClick={this.toggleLogin}>Logout</button>;
    } else {
      button = <button onClick={this.toggleLogin}>Login</button>;
    }

    return (
      <div>
        <h2>Blog Details</h2>
        {button}

        {/* Conditional rendering using && operator */}
        {this.state.isLoggedIn && (
          <ul>
            {this.state.blogs.map((blog) => (
              <li key={blog.id}>{blog.title}</li>
            ))}
          </ul>
        )}

        {!this.state.isLoggedIn && <p>Please login to view blogs.</p>}
      </div>
    );
  }
}

export default BlogDetails;