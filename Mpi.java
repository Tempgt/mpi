package mpi;
import mpi.*;

public class Mpi {
	public static void main(String[] args) {
		MPI.Init(args);
		int size=MPI.COMM_WORLD.Size();
		int myrank=MPI.COMM_WORLD.RANK();
		System.out.println("Hello World from rank"+myrank+"of"+size);
		MPI.Finalize();
	}
}
