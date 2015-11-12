package info.BlazeMC.BlazeAPI.Event;

public interface Cancellable
{
    public boolean isCancelled();
    public void setCancelled(boolean cancel);
}
