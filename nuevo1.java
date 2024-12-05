document.querySelector('.container2').addEventListener('click', function() {
    const details = this.querySelector('details');
    details.open = !details.open; // Alterna el estado abierto/cerrado
});
