import React, { Component } from 'react';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = { activeTab: 'books' };
    this.setTab = this.setTab.bind(this);
  }

  setTab(tab) {
    this.setState({ activeTab: tab });
  }

  // Conditional rendering using switch-case
  renderTab() {
    switch (this.state.activeTab) {
      case 'books':
        return <BookDetails />;
      case 'blogs':
        return <BlogDetails />;
      case 'courses':
        return <CourseDetails />;
      default:
        return null;
    }
  }

  render() {
    return (
      <div>
        <h1>Blogger App</h1>
        <button onClick={() => this.setTab('books')}>Books</button>
        <button onClick={() => this.setTab('blogs')}>Blogs</button>
        <button onClick={() => this.setTab('courses')}>Courses</button>
        <hr />
        {this.renderTab()}
      </div>
    );
  }
}

export default App;