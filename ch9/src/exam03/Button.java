package exam03;

public class Button {
    OnClickListener listener;
    
    public void SetOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }
    public void Touch() {
        listener.onClick();
    }
    interface OnClickListener {
        void onClick();
    }
}
