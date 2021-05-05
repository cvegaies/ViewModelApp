# ViewModel

## Ejemplo en el que se utiliza el ViewModel.

Enlaces relacionados:

[https://developer.android.com/topic/libraries/architecture/viewmodel](https://developer.android.com/topic/libraries/architecture/viewmodel)

[https://developer.android.com/jetpack/androidx/releases/lifecycle#declaring_dependencies](https://developer.android.com/jetpack/androidx/releases/lifecycle#declaring_dependencies)

La clase ViewModel se usa para almacenar y administrar datos relacionados con la interfaz de usuario de manera optimizada para los ciclos de vida.
La clase ViewModel permite que se conserven los datos después de los cambios de configuración, como las rotaciones de pantallas.

> ModeloVista modeloVista = new ViewModelProvider(this).get(ModeloVista.class);

![Imagen que muestra el ciclo de vida de un ViewModel](https://developer.android.com/images/topic/libraries/architecture/viewmodel-lifecycle.png)

Los objetos ViewModel pueden contener LifecycleObservers, como objetos LiveData.

> modeloVista.getLiveData().observe(this, new Observer&lt;List&gt;() {  
 @Override  
 public void onChanged(List data) {  
  //  
 }  
});
 
Se implementa una hebra utilizando la clase **Thread**:

> Thread thread = new Thread() {  
  @Override  
  public void run() {  
   //...  
  }  
 };  
 thread.start();
