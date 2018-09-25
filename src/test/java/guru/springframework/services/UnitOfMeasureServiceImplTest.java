package guru.springframework.services;


import guru.springframework.commands.UnitOfMeasureCommand;
import guru.springframework.converters.UnitOfMeasureToUnitOfMeasureCommand;
import guru.springframework.domain.UnitOfMeasure;
import guru.springframework.repositories.UnitOfMeasureRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class UnitOfMeasureServiceImplTest {

    @Mock
    UnitOfMeasureRepository repository;

    UnitOfMeasureService service;
    UnitOfMeasureToUnitOfMeasureCommand unitOfMeasureToUnitOfMeasureCommand = new UnitOfMeasureToUnitOfMeasureCommand();

    @Before
    public void setUp() throws Exception{
        MockitoAnnotations.initMocks(this);

        service = new UnitOfMeasureServiceImpl(repository,unitOfMeasureToUnitOfMeasureCommand);
    }

    @Test
    public void listAllUoms()throws Exception{
        //given
        Set<UnitOfMeasure> uomSet = new HashSet<>();

        UnitOfMeasure uom1 = new UnitOfMeasure();
        uom1.setId(1L);
        uomSet.add(uom1);

        UnitOfMeasure uom2 = new UnitOfMeasure();
        uom2.setId(2L);
        uomSet.add(uom2);

        when(repository.findAll()).thenReturn(uomSet);

        //when
        Set<UnitOfMeasureCommand> commands = service.listAllUom();

        //then
        assertEquals(2, commands.size());
        verify(repository, times(1)).findAll();

    }
}
