
package S1_2020;

public class Job
{
    protected String job;
    protected int task;
    protected int memory;

    public String getJob()
    {
        return job;
    }

    public int getTask()
    {
        return task;
    }

    public int getMemory() 
    {
        return memory;
    }

    public Job(String job, int task, int memory)
    {
        this.job = job;
        this.task = task;
        this.memory = memory;
    }

    @Override
    public String toString() 
    {
        return " + memory {";
    }
  
}
