import * as React from 'react';
import AppBar from '@mui/material/AppBar';
import Box from '@mui/material/Box';
import Toolbar from '@mui/material/Toolbar';
import Typography from '@mui/material/Typography';
import logo from "../images/logo.png";

export default function Appbar() {
  return (
    <Box sx={{ flexGrow: 1 }}>
      <AppBar position="static">
        <Toolbar>
       
        {/* <img src={logo} alt="student" width="50px" height="50px" /> */}
          <Typography variant="h6" component="div" sx={{ flexGrow: 1 }}>
            Fullstack Student Information System
          </Typography>
          
        </Toolbar>
      </AppBar>
    </Box>
  );
}
