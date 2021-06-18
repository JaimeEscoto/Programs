package com.company;

public class TaskManager {
    private Program[] programs;

    public TaskManager()
    {
        programs = new Program[10];
    }
    public TaskManager(int programsQty)
    {
        programs = new Program[programsQty];
    }
    public void createProgram(String nameParam, String userParam, double memorySizeParam)
    {
        Program temporalProgram = new Program();
        temporalProgram.setName(nameParam);
        temporalProgram.setUser(userParam);
        temporalProgram.setMemorySize(memorySizeParam);

        createProgram(temporalProgram);


    }

    public void createProgram(Program programParam)
    {
        int counter=0;
        //Program temporalProgram;
        while (counter < programs.length )
        {
            //temporalProgram = ;
            if(programs[counter]==null)
            {
                programs[counter]=programParam;
                break;
            }
            counter++;
        }

    }
    public void quitProgram(String nameParam)
    {
        int counter=0;
        //Program temporalProgram;
        while (counter < programs.length )
        {
            //temporalProgram = ;
            if(programs[counter]!=null)
            {
                //System.out.println(programs[counter].getName()+"----"+nameParam);
                if (programs[counter].getName().equalsIgnoreCase(nameParam)) {

                    programs[counter] = null;
                    break;
                }
            }
            counter++;
        }

    }

    public void cloneProgram(String programName){
        int counter=0;
        //Program temporalProgram;
        while (counter < programs.length )
        {
            //temporalProgram = ;
            if(programs[counter]!=null)
            {
                //System.out.println(programs[counter].getName()+"----"+nameParam);
                if (programs[counter].getName().equalsIgnoreCase(programName)) {
                    createProgram(programs[counter].getName(),programs[counter].getUser(),programs[counter].getMemorySize());
                    break;
                }
            }
            counter++;
        }
    }
    public void resetTaskManager(){
        int counter=0;
        //Program temporalProgram;
        while (counter < programs.length )
        {
            programs[counter]=null;
            counter++;
        }
    }


    public Program[] getPrograms() {
        return programs;
    }

}
