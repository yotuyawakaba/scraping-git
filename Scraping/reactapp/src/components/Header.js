import React from 'react'
import AppBar from '@mui/material/AppBar';
import Toolbar from '@mui/material/Toolbar';
import Typography from '@mui/material/Typography';
import HomeIcon from '@mui/icons-material/Home';
import { styled } from '@mui/material/styles';

const useStyles = styled(Typography)`
flex: 1;
`;

const Header = () => {
    const classes = useStyles;
    return (
        <AppBar position="static">
          <Toolbar>
          <HomeIcon />
            <a  target="_blank" href="https://freelance-start.com/">
            <Typography className={classes.typographyStyles}>
              取得元サイト
            </Typography>
            </a>
          </Toolbar>
        </AppBar>
    )
  };

export default Header