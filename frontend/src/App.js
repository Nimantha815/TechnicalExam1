// import logo from './logo.svg';
import './App.css';
import ListBankComponent from './components/ListBankComponent';
import ListOfCustomer from './components/ListOfCustomers';

function App() {
  return (
    <div className="App">
      <header className="App-header">
       <ListBankComponent/>
       <br></br>
       <br></br>
       <ListOfCustomer/>
      </header>
    </div>
  );
}

export default App;
