import math
import matplotlib.pyplot as plt # type: ignore

# Pedir al usuario que ingrese 12 elementos
elementos = [1,2,3,1,2,3,1,2,3,1,2,3]
xlabel = "X"
ylabel = "y"

# Calcular el promedio de la muestra
promedio = sum(elementos) / len(elementos)

# Calcular la sumatoria de las diferencias al cuadrado
sumatoria_diferencias_cuadradas = sum((elemento - promedio) ** 2 for elemento in elementos)

# Calcular el tamaño de la muestra
n = len(elementos)

# Calcular el error estándar de la desviación estándar de la muestra
Delta = math.sqrt(sumatoria_diferencias_cuadradas / (n * (n - 1)))

# Imprimir el resultado
print(f"El error estándar de la desviación estándar de la muestra es: {Delta}")

# Graficar los valores y la promedio
plt.figure(figsize=(10, 6))
plt.plot(elementos, 'bo-', label='Valores')
plt.axhline(y=promedio, color='r', linestyle='-', label='promedio')
plt.xlabel(xlabel)
plt.ylabel(ylabel)
plt.title('Valores de la Muestra y promedio')
plt.legend()
plt.grid(True)
plt.show()
plt.gca().set_aspect('equal', adjustable='box')
