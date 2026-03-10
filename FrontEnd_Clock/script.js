const hourDisplay = document.querySelector('#display-hour');
const minuteDisplay = document.querySelector('#display-minute');
const secondDisplay = document.querySelector('#display-second');

const renderClock = () => {
  const now = new Date();
  
  const time = {
    h: String(now.getHours()).padStart(2, '0'),
    m: String(now.getMinutes()).padStart(2, '0'),
    s: String(now.getSeconds()).padStart(2, '0')
  };

  hourDisplay.textContent = time.h;
  minuteDisplay.textContent = time.m;
  secondDisplay.textContent = time.s;
};

setInterval(renderClock, 1000);
renderClock();