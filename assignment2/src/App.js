import React, { Component } from 'react';
import './App.css';
import Validate from './ValidationComponent';
import Char from './CharComponent';

class App extends Component {

  state = {
    textLength: 0,
    text: ''
  }

  textChangeHandler = (event) => {
    this.setState({
      textLength: event.target.value.length,
      text: event.target.value
    })
  }

  removeCharHandler = (index) => {
    const text = [...this.state.text.split('')];
    text.splice(index, 1);
    const updatedText = text.join('');
    console.log(text);
    this.setState({
      text: updatedText,
      textLength: updatedText.length
    })
  }

  render() {
    return (
      <div className="App">
          <h2>Assignment 2</h2>
          Enter Text: <input type="text" onChange={this.textChangeHandler} value={this.state.text}/>
          <p>Text Length: {this.state.textLength}</p>
          <Validate textLength={this.state.textLength}/>
          {
            this.state.text.split('').map((value, index) => {
              return <Char 
                key={index} 
                click={() => this.removeCharHandler(index)} 
                value={value} />
            })
          }         
      </div>
    );
  }
}

export default App;
