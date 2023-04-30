const chatWindow = document.getElementById("chat-window");
const messageInput = document.getElementById("message-input");
const sendButton = document.getElementById("send-button");

sendButton.addEventListener("click", function() {
  const message = messageInput.value;
  const messageElement = document.createElement("div");
  messageElement.textContent = message;
  chatWindow.appendChild(messageElement);
  messageInput.value = "";
});

