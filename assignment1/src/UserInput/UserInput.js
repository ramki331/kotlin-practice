import React from 'react';
import './UserInput.css'

const style = {
    width: '60%'
}

const userInput = (props) => {
    return (
        <div className='UserInput'>
            <input style={style} type="text" onChange={props.changed} value={props.userName}/>
        </div>
    );
}

export default userInput;