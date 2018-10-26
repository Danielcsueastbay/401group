/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Model.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Viet
 */
public class JUtest {
    static Board board;
    static Path path;
    static TrainCardZone zone;
    static Player player;
    
    public JUtest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        board = new Board();
        path = new Path(0, 0, 0, 0, 2);
        zone = new TrainCardZone();
        player = new Player();
        
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testaddPath() {
        board.addPath(0, 0);
    }
    
    @Test   
    public void testisTherePath() {
        assertFalse(board.hasPath(0, 0));
    }
 
    @Test   
    public void testclaimPath() {
        board.claimPath(player, 0, 0);
    }
  
    @Test  
    public void testisPathClaimed() {
        assertFalse(path.isClaimedBy(player));
    }
    
    @Test
    public void testcalculateLengthPoints() {
        assertEquals(0, path.calculateValue());
    }
    
    @Test
    public void testisEmpty() {
        assertFalse(path.isEmpty());
    }
    
    @Test
    public void testisFull() {
        assertFalse(path.isFull());
    }
    
    @Test
    public void testclaim() {
        path.claim(player);
    }
    
    @Test
    public void testpickCard() {
        zone.pickCard();
    }
    
    @Test
    public void testaddCard() {
        zone.addCard();
    }
    
    @Test
    public void testremoveCard() {
        zone.removeCard();
    }
    
    @Test
    public void testhasThreeLocomotives() {
        assertFalse(zone.hasThreeLocomotives());
    }
    
}
