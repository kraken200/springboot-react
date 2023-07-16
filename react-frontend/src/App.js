import './App.css'
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'
import ListEmployeeComponent from './components/ListEmployeeComponent'
import HeaderComponent from './components/HeaderComponent'
import FooterComponent from './components/FooterComponent'
import AddEmployeeComponent from './components/AddEmployeeComponent'
function App() {
  return (
    <div className="App">
      <Router>
        <HeaderComponent />
        <div className="container">
          <Switch>
            localhost:3000/
            <Route exact path="/" component={ListEmployeeComponent}></Route>
            <Route path="/employees" component={ListEmployeeComponent}></Route>
            <Route
              path="/add-employee"
              component={AddEmployeeComponent}
            ></Route>
            <Route
              path="/edit-employees/:id"
              component={AddEmployeeComponent}
            ></Route>
          </Switch>
        </div>
        <FooterComponent />
      </Router>
    </div>
  )
}

export default App
