function connect() {
  var socket = new SockJS('http://localhost:8080/gs-guide-websocket');
  stompClient = Stomp.over(socket);
  stompClient.connect({}, function (frame) {
      console.log('Connected: ' + frame);
      stompClient.subscribe('localhost:8080/topic/greetings', function (greeting) {
          
      });
  });
}