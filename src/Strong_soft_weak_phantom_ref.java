import java.lang.ref.*;

public class Strong_soft_weak_phantom_ref {

    public static void main(String[] args) {
        // 1. Strong Reference
        strongReferenceExample();

        // 2. Soft Reference
        softReferenceExample();

        // 3. Weak Reference
        weakReferenceExample();

        // 4. Phantom Reference
        phantomReferenceExample();
    }

    private static void strongReferenceExample() {
        System.out.println("1. Strong Reference:");
        Object strongObj = new Object();
        System.out.println("Strong Reference Object: " + strongObj);
    }

    private static void softReferenceExample() {
        System.out.println("\n2. Soft Reference:");
        Object obj = new Object();
        SoftReference<Object> softRef = new SoftReference<>(obj);
        obj = null; // making the strong reference null to make it eligible for garbage collection
        System.out.println("Soft Reference Object: " + softRef.get());
    }

    private static void weakReferenceExample() {
        System.out.println("\n3. Weak Reference:");
        Object obj = new Object();
        WeakReference<Object> weakRef = new WeakReference<>(obj);
        obj = null; // making the strong reference null to make it eligible for garbage collection
        System.out.println("Weak Reference Object: " + weakRef.get());
    }

    private static void phantomReferenceExample() {
        System.out.println("\n4. Phantom Reference:");
        Object obj = new Object();
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        PhantomReference<Object> phantomRef = new PhantomReference<>(obj, referenceQueue);
        obj = null; // making the strong reference null to make it eligible for garbage collection

        // Perform cleanup operations before the object is actually reclaimed
        // (This could include releasing resources associated with the object)
        System.out.println("Cleaning up resources associated with Phantom Reference Object");
        System.out.println("Phantom Reference Object: " + phantomRef.get());
    }
}