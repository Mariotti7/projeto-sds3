import NavBar from "./components/NavBar";
import React from "react";
import Footer from "./components/Footer";
import DataTable from "./components/DataTable";

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary">React is On</h1>
        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
