document.addEventListener('DOMContentLoaded', () => {
  const form = document.getElementById('formRegistro');

  form.addEventListener('submit', async (e) => {
    e.preventDefault();

    const nombre = document.getElementById('nombre').value.trim();
    const correo = document.getElementById('email').value.trim();
    const contraseña = document.getElementById('password').value;
    const confirmar = document.getElementById('confirmPassword').value;

    if (contraseña !== confirmar) {
      alert('Las contraseñas no coinciden');
      return;
    }

    try {
      const response = await axios.post('/api/routes/usuarios', {
        nombre,
        correo,
        contraseña,
        rol: 'usuario' // o "tecnico", según lo que quieras por defecto
      });

      alert('¡Usuario registrado exitosamente!');
      window.location.href = 'login.html';

    } catch (error) {
      if (error.response?.data?.error) {
        alert(`Error: ${error.response.data.error}`);
      } else {
        alert('Hubo un problema al registrar el usuario');
      }
    }
  });
});
