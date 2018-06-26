import React from 'react';

const validationComponent = (props) => {

    const DisplayMessage = () => {
        return (
            props.textLength < 5 ? "Text too short" : "Text long enough"
        )
    }

    return (
        <div className='ValidationComponent'>
            Validation: <DisplayMessage />
        </div>
    )
}

export default validationComponent;