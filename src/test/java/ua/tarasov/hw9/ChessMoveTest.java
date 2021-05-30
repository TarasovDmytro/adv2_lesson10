package ua.tarasov.hw9;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.any;

@RunWith(MockitoJUnitRunner.class)
public class ChessMoveTest {


    ChessKnight validate = new ChessKnight();
    ChessMove start = new ChessMove();
    @InjectMocks
    ChessMove finish = new ChessMove("c2");

    @Mock
    ConverterChessCoordinatesToIndexes converterMock;

    @Test
    public void validateMove_trueMove() {

        Mockito.when(converterMock.getIndexI()).thenReturn(2);
        Mockito.when(converterMock.getIndexJ()).thenReturn(1);
        boolean result = validate.checkTurn(start.indexI, start.indexJ, finish.indexI, finish.indexJ);
        Assert.assertTrue(result);
    }


    @Test
    public void validateMove_falseMove() {

        Mockito.when(converterMock.getIndexI()).thenReturn(8);
        Mockito.when(converterMock.getIndexJ()).thenReturn(5);
        boolean result = validate.checkTurn(start.indexI, start.indexJ, 8, 5);
        Assert.assertFalse(result);
    }
    @Test
    public void validateMove_outsideTheChessboard() {

        Mockito.when(converterMock.getIndexI()).thenReturn(-1);
        Mockito.when(converterMock.getIndexJ()).thenReturn(5);
        boolean result = validate.checkTurn(start.indexI, start.indexJ, -1, 5);
        Assert.assertFalse(result);
    }
}
