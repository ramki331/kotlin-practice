import React, { Component } from 'react';
import './App.css';
import UserInput from './UserInput/UserInput';
import UserOutput from './UserOutput/UserOutput';

class App extends Component {

  state = {
    userName: 'stateuser'
  }

  inputChangeHandler = (event) => {
    this.setState({
      userName: event.target.value
    })
  }

  render() {
    return (
      <div className="App">
        <h1>Assignment - 1</h1>
          <UserInput userName={this.state.userName} changed={this.inputChangeHandler}/>
          <UserOutput userName="reactuser-1"/>
          <UserOutput userName={this.state.userName}/>
      </div>
    );
  }
}

export default App;
