package ao.morgado.feature.machine;

import ao.morgado.bootstrapper.db.Repository;

import java.util.List;

public class MachineService
        implements Repository<MachineData, String> {

    @Override
    public MachineData findById(String  id) {
        String query = "SELECT * FROM users WHERE uuid="+id;
        return new MachineData(id, "12345678.9", "-12342332.0");
    }

    @Override
    public List<MachineData> findAll() {
        return List.of();
    }

    @Override
    public MachineData save(MachineData entity) {
        return null;
    }

    @Override
    public void deleteById(String uuid) {}
}