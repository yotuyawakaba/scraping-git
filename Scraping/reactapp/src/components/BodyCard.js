import * as React from 'react';
import Box from '@mui/material/Box';
import Card from '@mui/material/Card';
import CardActions from '@mui/material/CardActions';
import CardContent from '@mui/material/CardContent';
import Button from '@mui/material/Button';
import Typography from '@mui/material/Typography';


const bull = (
  <Box
    component="span"
    sx={{ display: 'inline-block', mx: '2px', transform: 'scale(0.8)' }}
  >
    •
  </Box>
);

export default function BasicCard(props) {
  const { id, title, fee, place, outline, source_of_information, url } = props;

  return (
    <Card sx={{ minWidth: 275 }}>
      <CardContent>
        <Box
          sx={{
              height: '50px',
              fontsize: 10,
              overflow: 'hidden',
              textOverflow: 'ellipsis',
              whiteSpace: 'nowrap',
              "& .MuiCardHeader-content": {
                overflow: 'hidden'
            } }}
        >
        <Typography>
        {title}
        </Typography>
        </Box>
        <Typography sx={{ mb: 1.5, fontSize:10 }} color="text.secondary">
        単価:{fee}
        </Typography>
        <Typography sx={{fontSize: 1, mb: 1.5 }} color="text.secondary">
        {place}
        </Typography>
        <Box
          sx={{
              height: '200px',
              overflow: 'hidden' }}
        >
        <Typography variant="body2">
        {outline}
        </Typography>
        </Box>
        <Typography sx={{ fontSize: 1, textOverflow: 'ellipsis', overflow: 'hidden', whiteSpace: 'nowrap', }} color="text.secondary">
        {source_of_information}
        </Typography>
      </CardContent>
      <CardActions>
        <a target="_blank" href={url}>
        <Button size="small">詳細はこちら</Button></a>
      </CardActions>
    </Card>
  );
}