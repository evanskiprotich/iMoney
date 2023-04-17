import { BrowserRouter, Route, Routes } from "react-router-dom";
import "./App.css";
import CreateTransaction from "./components/CreateTransaction";
import GetTransaction from "./components/GetTransaction";

import Main from "./components/Main";
import Navbar from "./components/Navbar";
import Footer from "./components/Footer";
import Transaction from "./components/Transaction";

function App() {
  return (
    <>
      <BrowserRouter>
        <Navbar />
        <Routes>
          <Route index element={<Main />} />
          <Route path="/" element={<Main />} />
          <Route path="/createTransaction" element={<CreateTransaction />} />
          <Route
            path="/getTransaction/:merchant/:accountNumber"
            element={<GetTransaction />}
          />
          <Route path="/transactions" element={<Transaction />} />
        </Routes>
        <Footer />
      </BrowserRouter>
    </>
  );
}

export default App;
