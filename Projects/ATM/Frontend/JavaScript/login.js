document.getElementById('loginForm').addEventListener('submit', function(e) {
  e.preventDefault();

  const cn = document.getElementById('customerNumber').value;
  const pin = document.getElementById('pin').value;

  // 🔹 Option A: Simple frontend validation (for demo)
  const validUsers = { "952141": "191904", "98947": "71976" };

  if (validUsers[cn] === pin) {
    sessionStorage.setItem('customerNumber', cn);
    window.location.href = 'dashboard.html';
  } else {
    document.getElementById('errorMsg').textContent = "Invalid credentials!";
  }

  // 🔹 Option B: Send to backend servlet (for real project)
  /*
  fetch('/LoginServlet', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({ customerNumber: cn, pin: pin })
  })
  .then(res => res.json())
  .then(data => {
    if (data.success) window.location.href = 'dashboard.html';
    else document.getElementById('errorMsg').textContent = data.message;
  });
  */
});