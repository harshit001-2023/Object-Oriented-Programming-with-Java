// Load customer number on page load
document.getElementById('custNum').textContent = sessionStorage.getItem('customerNumber');

// 🔹 Keep balance in memory for demo (replace with backend call later)
let balances = { checking: 1000.00, savings: 2500.00 };

function showAccount(type) {
  document.getElementById('balance').textContent =
    '$' + balances[type].toFixed(2);
}

function withdraw() {
  const amount = parseFloat(document.getElementById('amount').value);
  const type = 'checking'; // or get from selected tab

  if (amount > 0 && balances[type] >= amount) {
    balances[type] -= amount;
    showAccount(type);
    alert('Withdrawal successful!');
  } else {
    alert('Invalid amount or insufficient balance!');
  }
}

function deposit() {
  const amount = parseFloat(document.getElementById('amount').value);
  const type = 'checking';

  if (amount > 0) {
    balances[type] += amount;
    showAccount(type);
    alert('Deposit successful!');
  }
}

function logout() {
  sessionStorage.clear();
  window.location.href = 'index.html';
}