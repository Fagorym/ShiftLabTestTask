create table disks
(
    serial_number varchar references good (serial_number),
    size_gb       int
);

create table monitor
(
    serial_number varchar references good (serial_number),
    diagonal_inch int
);

create table laptop
(
    serial_number varchar references good (serial_number),
    monitor_size  int
);

create table desktop
(
    serial_number varchar references good (serial_number),
    shape         varchar
)