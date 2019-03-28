package cucumber.api.event;

abstract class TimeStampedEvent implements Event {

    private final Long timeStamp;
    private final long timeStampMillis;

    TimeStampedEvent(Long timeStamp, Long timeStampMillis) {
        this.timeStamp = timeStamp;
        this.timeStampMillis = timeStampMillis;
    }

    /**
     * Returns timestamp in nano seconds since an arbitrary start time.
     *
     * @see System#nanoTime()
     *
     * @return timestamp in nano seconds
     */
    @Override
    public Long getTimeStamp() {
        return timeStamp;
    }

    /**
     * Returns timestamp in milliseconds of the epoch.
     *
     * @see System#currentTimeMillis()
     *
     * @return timestamp in epoch
     */
    @Override
    public long getTimeStampMillis() {
        return timeStampMillis;
    }
}
