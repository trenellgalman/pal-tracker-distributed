package io.pivotal.pal.tracker.allocations;

import java.util.Objects;

public class AllocationInfo {

  public final long id;
  public final long projectId;
  public final long userId;
  public final String firstDay;
  public final String lastDay;
  public final String info;

  private AllocationInfo() { // for jackson
    this(allocationInfoBuilder());
  }

  public AllocationInfo(Builder builder) {
    id = builder.id;
    projectId = builder.projectId;
    userId = builder.userId;
    firstDay = builder.firstDay;
    lastDay = builder.lastDay;
    info = builder.info;
  }

  public static Builder allocationInfoBuilder() {
    return new Builder();
  }

  @Override
  public String toString() {
    return "AllocationInfo{"
        + "id="
        + id
        + ", projectId="
        + projectId
        + ", userId="
        + userId
        + ", firstDay="
        + firstDay
        + ", lastDay="
        + lastDay
        + ", info='"
        + info
        + '\''
        + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    AllocationInfo info1 = (AllocationInfo) o;

    if (id != info1.id) return false;
    if (projectId != info1.projectId) return false;
    if (userId != info1.userId) return false;
    if (!Objects.equals(firstDay, info1.firstDay)) return false;
    if (!Objects.equals(lastDay, info1.lastDay)) return false;
    return Objects.equals(info, info1.info);
  }

  @Override
  public int hashCode() {
    int result = (int) (id ^ (id >>> 32));
    result = 31 * result + (int) (projectId ^ (projectId >>> 32));
    result = 31 * result + (int) (userId ^ (userId >>> 32));
    result = 31 * result + (firstDay != null ? firstDay.hashCode() : 0);
    result = 31 * result + (lastDay != null ? lastDay.hashCode() : 0);
    result = 31 * result + (info != null ? info.hashCode() : 0);
    return result;
  }

  public static class Builder {
    private long id;
    private long projectId;
    private long userId;
    private String firstDay;
    private String lastDay;
    private String info;

    public AllocationInfo build() {
      return new AllocationInfo(this);
    }

    public Builder id(long id) {
      this.id = id;
      return this;
    }

    public Builder projectId(long projectId) {
      this.projectId = projectId;
      return this;
    }

    public Builder userId(long userId) {
      this.userId = userId;
      return this;
    }

    public Builder firstDay(String firstDay) {
      this.firstDay = firstDay;
      return this;
    }

    public Builder lastDay(String lastDay) {
      this.lastDay = lastDay;
      return this;
    }

    public Builder info(String info) {
      this.info = info;
      return this;
    }
  }
}
