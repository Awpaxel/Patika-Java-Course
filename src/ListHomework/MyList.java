package ListHomework;


public class MyList<T> {
    private T[] array;
    private int size;
    private int capacity;

    // Boş constructor - varsayılan kapasite 10
    @SuppressWarnings("unchecked")
    public MyList() {
        this.capacity = 10;
        this.array = (T[]) new Object[capacity];
        this.size = 0;
    }

    // Parametreli constructor - kapasite parametre olarak alınır
    @SuppressWarnings("unchecked")
    public MyList(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
        this.size = 0;
    }

    // Dizideki eleman sayısını verir
    public int size() {
        return this.size;
    }

    // Dizinin kapasite değerini verir
    public int getCapacity() {
        return this.capacity;
    }

    // Diziye eleman ekler, gerekirse kapasiteyi 2 katına çıkarır
    public void add(T data) {
        if (size >= capacity) {
            // Kapasite dolmuşsa, 2 katına çıkar
            increaseCapacity();
        }
        array[size] = data;
        size++;
    }

    // Kapasiteyi 2 katına çıkarır
    @SuppressWarnings("unchecked")
    private void increaseCapacity() {
        capacity *= 2;
        T[] newArray = (T[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    // Verilen indisteki değeri döndürür
    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return array[index];
    }

    // Verilen indisteki veriyi siler ve sonrasındaki verileri sola kaydırır
    public T remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        T removedData = array[index];

        // Elemanları sola kaydır
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;

        return removedData;
    }

    // Verilen indisteki veriyi yenisi ile değiştirir
    public T set(int index, T data) {
        if (index < 0 || index >= size) {
            return null;
        }
        T oldData = array[index];
        array[index] = data;
        return oldData;
    }

    // Dizideki elemanları listeler
    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // Parametrede verilen nesnenin listedeki ilk indeksini verir
    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (array[i] == null && data == null) {
                return i;
            }
            if (array[i] != null && array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    // Parametrede verilen nesnenin listedeki son indeksini verir
    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i] == null && data == null) {
                return i;
            }
            if (array[i] != null && array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    // Listenin boş olup olmadığını kontrol eder
    public boolean isEmpty() {
        return size == 0;
    }

    // Listedeki öğeleri array haline getirir
    public Object[] toArray() {
        Object[] result = new Object[size];
        for (int i = 0; i < size; i++) {
            result[i] = array[i];
        }
        return result;
    }

    // Listedeki bütün öğeleri siler
    @SuppressWarnings("unchecked")
    public void clear() {
        this.capacity = 10;
        this.array = (T[]) new Object[capacity];
        this.size = 0;
    }

    // Belirtilen indeks aralığına ait bir liste döner
    public MyList<T> subList(int start, int finish) {
        if (start < 0 || finish >= size || start > finish) {
            return new MyList<>();
        }

        MyList<T> subList = new MyList<>(finish - start + 1);
        for (int i = start; i <= finish; i++) {
            subList.add(array[i]);
        }
        return subList;
    }

    // Parametrede verilen değerin dizide olup olmadığını söyler
    public boolean contains(T data) {
        return indexOf(data) != -1;
    }
}

