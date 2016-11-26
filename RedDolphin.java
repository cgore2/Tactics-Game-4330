package dolphingame;

public class RedDolphin extends Unit{

	public RedDolphin(int r, int c, int hp, int ap, int ar){
		
		super(r, c, hp, ap, ar);
	
	}
	
	@Override
	public void MoveUnit(Square s, Square z){
		s.setRow(z.getRow());
        s.setColumn(z.getColumn());
	}

}
