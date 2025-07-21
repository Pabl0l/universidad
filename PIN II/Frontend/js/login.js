document.addEventListener('DOMContentLoaded', () => {
  const form = document.querySelector('.login-form');

  form.addEventListener('submit', async (e) => {
    e.preventDefault(); // Prevenir que se recargue la página

    const correo = document.getElementById('email').value.trim();
    const contraseña = document.getElementById('password').value;

    try {
      const response = await axios.post('/api/routes/login', {
        correo,
        contraseña
      });

      const { token, usuario } = response.data;

      // Guardar token y datos del usuario en localStorage
      localStorage.setItem('token', token);
      localStorage.setItem('usuario', JSON.stringify(usuario));

      // Redirigir a la página principal o dashboard
      window.location.href = '/dashboard.html'; // Cambia esto por tu página principal

    } catch (error) {
      if (error.response) {
        alert(error.response.data.error || 'Error al iniciar sesión');
      } else {
        alert('No se pudo conectar con el servidor');
      }
    }
  });
});
