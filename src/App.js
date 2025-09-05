//import logo from './logo.svg';
import taylorlogo from './taylorlogo.png';
import {BrowserRouter as Router, Routes, Route, Link} from 'react-router-dom';
import reputation from './reputation.jpeg';
import red from './red.jpeg';
import speaknow from './speaknow.jpeg';
import nineteen from './nineteen.jpeg';
import './App.css';
import {useId} from 'react';

import "./Fonts/TheFrightHouseDEMO.otf";
import "./Fonts/Andrea Bellarosa.ttf";
import "./Fonts/Taytex.ttf";



function GamePage()
{
  return(
    <div className = "GamePage">
      <h1>Choose an Album: </h1>
      <div className = "AlbumButtons">
        <Link to = "/rep">
          <button className = "ReputationButton">
            <img src={reputation} className="reputation" alt="reputation" />
          </button>
        </Link>
        <Link to = "/red">
          <button className = "RedButton">
            <img src={red} className="red" alt="red" />
          </button>
        </Link>
        <Link to = "/speak">
          <button className = "SpeakNow">
            <img src={speaknow} className="speaknow" alt="speaknow" />
          </button>
        </Link>
        <Link to = "/nine">
          <button className = "NineteenButton">
            <img src={nineteen} className="nineteen" alt="nineteen" />
          </button>
        </Link>
        
      </div> 
    </div>
  );

}

function RepPage()
{
  const lyricGuess = useId();
  return (
    <div className = "repPage">
      <div className = "repGuess">
        <p>Guess the Song! </p>
        <input song="song" />
      </div>
    </div>
    
  )
}
function RedPage()
{
  const lyricGuess = useId();
  return (
    <div className = "redPage">
      <div className = "redGuess">
        <p>Guess the Song! </p>
        <input song="song" />
      </div>
    </div>
    
  )

}

function SpeakPage()
{
  const lyricGuess = useId();
  return (
    <div className = "speakPage">
      <div className = "speakGuess">
        <p>Guess the Song! </p>
        <input song="song" />
      </div>
    </div>
    
  )

}

function NinePage()
{
  const lyricGuess = useId();
  return (
    <div className = "ninePage">
      <div className = "nineGuess">
        <p>Guess the Song! </p>
        <input song="song" />
      </div>
    </div>
    
  )

}

function HomePage()
{
  return(
    <div className="App">
      <header className="App-header">
        <img src={taylorlogo} className="App-logo" alt="taylorlogo" />
        <p>
          Taylor Swift Song Guesser!
        </p>
        <Link to = "/game">
          <button className = "start-button">
            Start!
          </button>
        </Link>
      </header>
    </div>
  );
}

function App() {
  return (
    <Router>
      <Routes>
        <Route path = "/" element ={<HomePage / >} />
        <Route path = "/game" element ={<GamePage / >} />
        <Route path = "/rep" element ={<RepPage / >} />
        <Route path = "/Nine" element ={<NinePage / >} />
        <Route path = "/red" element ={<RedPage / >} />
        <Route path = "/speak" element ={<SpeakPage / >} />
      </Routes>
    </Router>
  );
}


export default App;
