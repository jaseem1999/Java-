public class Hello {
    public static void main(String[] args) {
        SampleThread st = new SampleThread();
        SampleThread st2 = new SampleThread();
        SampleThread st3 = new SampleThread();

        st.start();
        st2.start();
        st3.start();


    }
    
}
